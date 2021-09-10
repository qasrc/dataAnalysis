package com.example.dataanalysis.controller;

import com.example.dataanalysis.basic.ActionResult;
import com.example.dataanalysis.service.ImportExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private ImportExcelService importExcelService;

    @PostMapping("/device")
    @ResponseBody
    public ActionResult uploadVirusLog(MultipartHttpServletRequest multipartHttpServletRequest) throws IOException {
        MultipartFile multipartFile = multipartHttpServletRequest.getFile(multipartHttpServletRequest.getFileNames().next());
        if (multipartFile != null) {
            return importExcelService.importDeviceExcel(multipartFile.getInputStream());
        }
        return new ActionResult(1, "文件获取失败");
    }

    @PostMapping("/vpnUser")
    @ResponseBody
    public ActionResult updateVpnUser(MultipartHttpServletRequest multipartHttpServletRequest) throws IOException {
        MultipartFile multipartFile = multipartHttpServletRequest.getFile(multipartHttpServletRequest.getFileNames().next());
        if (multipartFile != null) {
            return importExcelService.importVpnUserExcel(multipartFile.getInputStream());
        }
        return new ActionResult(1, "文件获取失败");
    }

    @PostMapping("/virusLog")
    @ResponseBody
    public ActionResult updateVirusLog(MultipartHttpServletRequest multipartHttpServletRequest) throws IOException {
        MultipartFile multipartFile = multipartHttpServletRequest.getFile(multipartHttpServletRequest.getFileNames().next());
        if (multipartFile != null) {
            return importExcelService.importVirusLogExcel(multipartFile.getInputStream());
        }
        return new ActionResult(1, "文件获取失败");
    }
}
