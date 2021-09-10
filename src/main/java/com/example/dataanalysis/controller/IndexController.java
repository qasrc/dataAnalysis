package com.example.dataanalysis.controller;

import com.example.dataanalysis.basic.ActionResult;
import com.example.dataanalysis.basic.Device;
import com.example.dataanalysis.basic.SearchCommon;
import com.example.dataanalysis.service.ImportExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/views")
public class IndexController {

    @Autowired
    private ImportExcelService deviceService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/list")
    public String index(Model model) {
        model.addAttribute("name", "test");
        return "list";
    }

    @RequestMapping("/import")
    public String importExcel(){
        return "importExcel";
    }

    @RequestMapping("/deviceListPage")
    public String toDeviceListPage() {
        return "deviceList";
    }

    @RequestMapping("/deviceList")
    @ResponseBody
    public ActionResult deviceList(int page, int limit) {
        SearchCommon<Device> searchCommon = new SearchCommon<>();
        searchCommon.setPage(page);
        searchCommon.setLimit(limit);
        return deviceService.pageList(searchCommon);
    }

    @RequestMapping("/vpnUserList")
    @ResponseBody
    public ActionResult vpnUserList(int page, int limit) {
        SearchCommon<Device> searchCommon = new SearchCommon<>();
        searchCommon.setPage(page);
        searchCommon.setLimit(limit);
        return deviceService.pageList(searchCommon);
    }

    @RequestMapping("/virusLogList")
    @ResponseBody
    public ActionResult virusLogList(int page, int limit) {
        SearchCommon<Device> searchCommon = new SearchCommon<>();
        searchCommon.setPage(page);
        searchCommon.setLimit(limit);
        return deviceService.pageList(searchCommon);
    }
}
