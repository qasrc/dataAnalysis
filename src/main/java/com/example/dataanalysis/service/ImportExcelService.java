package com.example.dataanalysis.service;

import com.example.dataanalysis.basic.*;
import com.example.dataanalysis.mapper.DeviceDao;
import com.example.dataanalysis.mapper.VirusLogDao;
import com.example.dataanalysis.mapper.VpnUserDao;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ImportExcelService {
    private final DeviceDao deviceDao;

    private final VpnUserDao vpnUserDao;

    private final VirusLogDao virusLogDao;

    public static final String FORMAT_STR = "yyyy-MM-dd HH:mm:ss";

    public ImportExcelService(DeviceDao deviceDao, VpnUserDao vpnUserDao, VirusLogDao virusLogDao) {
        this.deviceDao = deviceDao;
        this.vpnUserDao = vpnUserDao;
        this.virusLogDao = virusLogDao;
    }

    /**
     * 设备列表查询
     */
    public ActionResult pageList(SearchCommon<Device> condition) {
        ActionResult actionResult = new ActionResult();
        PageHelper.startPage(condition.getPage(), condition.getLimit());
        List<Device> deviceList = deviceDao.listPage(condition.getFilter());
        actionResult.setCount(deviceDao.listPageCount(condition.getFilter()));
        actionResult.setCode(0);
        actionResult.setMessage("处理成功");
        actionResult.setData(deviceList);
        return actionResult;
    }

    /**
     * 导入桌管设备列表
     */
    @Transactional
    public ActionResult importDeviceExcel(InputStream inputStream) throws IOException {
        ActionResult actionResult = new ActionResult();
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int totalRow = sheet.getLastRowNum();
        if (totalRow < 2) {
            actionResult.setCode(1);
            actionResult.setMessage("模板内容不正确");
            return actionResult;
        }
        for (int i = 1; i <= totalRow; i++) {
            XSSFRow xssfRow = sheet.getRow(i);
            Device device = new Device();
            device.setId(UUID.randomUUID().toString());
            device.setOrgName(getCellValue(xssfRow, 0));
            device.setRemark(getCellValue(xssfRow, 1));
            device.setDepartName(getCellValue(xssfRow, 2));
            device.setCellphone(getCellValue(xssfRow, 3));
            device.setLandlinePhone(getCellValue(xssfRow, 4));
            device.setComputerName(getCellValue(xssfRow, 5));
            device.setStatus(getCellValue(xssfRow, 6));
            device.setGroup(getCellValue(xssfRow, 7));
            device.setIpAddress(getCellValue(xssfRow, 8));
            if (StringUtils.isNotBlank(getCellValue(xssfRow, 9))) {
                device.setIndex(Integer.valueOf(getCellValue(xssfRow, 9)));
            }
            device.setDeviceType(getCellValue(xssfRow, 10));
            device.setBrowserVersion(getCellValue(xssfRow, 11));
            device.setClientVersion(getCellValue(xssfRow, 12));
            device.setPlatform(getCellValue(xssfRow, 13));
            device.setSystemType(getCellValue(xssfRow, 14));
            device.setSystemVersion(getCellValue(xssfRow, 15));
            String lastConnTimeStr = getCellValue(xssfRow, 16);
            if (StringUtils.isNotBlank(lastConnTimeStr)) {
                device.setLastConnTime(getDateByStr(lastConnTimeStr, FORMAT_STR));
            }
            String lastBrokenTimeStr = getCellValue(xssfRow, 17);
            if(StringUtils.isNotBlank(lastBrokenTimeStr)){
                device.setLastBrokenTime(getDateByStr(lastBrokenTimeStr,FORMAT_STR));
            }
            device.setLoginAccount(getCellValue(xssfRow, 18));
            device.setCommIpAddress(getCellValue(xssfRow, 19));
            device.setMacAddress(getCellValue(xssfRow, 20));
            device.setEmail(getCellValue(xssfRow, 21));
            device.setLocation(getCellValue(xssfRow, 22));
            device.setPosition(getCellValue(xssfRow, 23));
            device.setUseName(getCellValue(xssfRow, 24));
            device.setUseDepartment(getCellValue(xssfRow, 25));
            String registerTimeStr = getCellValue(xssfRow, 26);
            if (StringUtils.isNotBlank(registerTimeStr)) {
                device.setRegisterTime(getDateByStr(registerTimeStr, FORMAT_STR));
            }
            device.setUsePhone(getCellValue(xssfRow, 27));
            device.setUseStatus(getCellValue(xssfRow, 28));
            device.setRegisterStatus(getCellValue(xssfRow, 29));
            device.setComputerSource(getCellValue(xssfRow, 30));
            device.setBalanceNo(getCellValue(xssfRow, 31));
            String startTimeStr = getCellValue(xssfRow, 32);
            if (StringUtils.isNotBlank(startTimeStr)) {
                device.setNetinStartTime(getDateByStr(startTimeStr,FORMAT_STR));
            }
            String endTimeStr = getCellValue(xssfRow, 33);
            if (StringUtils.isNotBlank(endTimeStr)) {
                device.setNetinEndTime(getDateByStr(endTimeStr,FORMAT_STR));
            }
            device.setRegisterType(getCellValue(xssfRow, 34));
            device.setApproveStatus(getCellValue(xssfRow, 35));
            device.setAntivirusName(getCellValue(xssfRow, 36));
            device.setAntivirusVersion(getCellValue(xssfRow, 37));
            device.setAntivirusNewest(getCellValue(xssfRow, 38));
            device.setVirusDatabaseVersion(getCellValue(xssfRow, 39));
            device.setDefaultBrowser(getCellValue(xssfRow, 40));
            device.setActiveStatus(getCellValue(xssfRow, 41));
            device.setAuthorizeStatus(getCellValue(xssfRow, 42));
            deviceDao.insertSelective(device);
        }
        actionResult.setCode(0);
        actionResult.setMessage("导入成功");
        return actionResult;
    }

    private Date getDateByStr(String dateStr, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            return simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 获取单元格内容
     */
    public String getCellValue(XSSFRow xssfRow, int i) {
        String value = "";
        if (xssfRow.getCell(i) != null) {
            xssfRow.getCell(i).setCellType(Cell.CELL_TYPE_STRING);
            value = xssfRow.getCell(i).getStringCellValue();
        }
        return value;
    }

    /**
     * 导入vpn用户列表
     */
    @Transactional
    public ActionResult importVpnUserExcel(InputStream inputStream) throws IOException {
        ActionResult actionResult = new ActionResult();
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int totalRow = sheet.getLastRowNum();
        if (totalRow < 2) {
            actionResult.setCode(1);
            actionResult.setMessage("模板内容不正确");
            return actionResult;
        }
        for (int i = 1; i <= totalRow; i++) {
            XSSFRow xssfRow = sheet.getRow(i);
            VpnUser vpnUser = new VpnUser();
            vpnUser.setId(UUID.randomUUID().toString());
            vpnUser.setUsername(getCellValue(xssfRow, 0));
            vpnUser.setGroupPath(getCellValue(xssfRow, 1));
            vpnUser.setPassword(getCellValue(xssfRow, 2));
            vpnUser.setPhone(getCellValue(xssfRow, 3));
            vpnUser.setIpAddress(getCellValue(xssfRow, 4));
            vpnUser.setDesc(getCellValue(xssfRow, 5));
            vpnUser.setCa(getCellValue(xssfRow, 6));
            vpnUser.setCertificate(getCellValue(xssfRow, 7));
            vpnUser.setLastLogin(getCellValue(xssfRow, 8));
            vpnUserDao.insertSelective(vpnUser);
        }
        actionResult.setCode(0);
        actionResult.setMessage("导入成功");
        return actionResult;
    }

    /**
     * 导入杀毒日志列表
     */
    @Transactional
    public ActionResult importVirusLogExcel(InputStream inputStream) throws IOException {
        ActionResult actionResult = new ActionResult();
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int totalRow = sheet.getLastRowNum();
        if (totalRow < 2) {
            actionResult.setCode(1);
            actionResult.setMessage("模板内容不正确");
            return actionResult;
        }
        for (int i = 1; i <= totalRow; i++) {
            XSSFRow xssfRow = sheet.getRow(i);
            VirusLog virusLog = new VirusLog();
            virusLog.setId(UUID.randomUUID().toString());
            virusLog.setDate(null);
            virusLog.setTerminal(getCellValue(xssfRow, 1));
            virusLog.setDomain(getCellValue(xssfRow, 2));
            virusLog.setLoginName(getCellValue(xssfRow, 3));
            virusLog.setPlatform(getCellValue(xssfRow, 4));
            virusLog.setSecurityThreat(getCellValue(xssfRow, 5));
            virusLog.setInfectSource(getCellValue(xssfRow, 6));
            virusLog.setInfectFile(getCellValue(xssfRow, 7));
            virusLog.setFilePath(getCellValue(xssfRow, 8));
            virusLog.setType(getCellValue(xssfRow, 9));
            virusLog.setResult(getCellValue(xssfRow, 10));
            virusLog.setIpAddress(getCellValue(xssfRow, 11));
            virusLog.setMacAddress(getCellValue(xssfRow, 12));
            virusLogDao.insertSelective(virusLog);
        }
        actionResult.setCode(0);
        actionResult.setMessage("导入成功");
        return actionResult;
    }
}
