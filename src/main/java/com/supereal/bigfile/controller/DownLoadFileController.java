package com.supereal.bigfile.controller;

import com.supereal.bigfile.utils.DownloadUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: bigfile
 * @description: 文件及文件夹 压缩 下载
 * @author: lixing
 * @create: 2020-11-17 20:04
 **/
@RestController
@RequestMapping("/download")
public class DownLoadFileController {

    /**
     * http://127.0.0.1:8080/bigfile/download/downloadLocal?filePath=F:/支付宝支付RSA2升级版SDK.rar
     *
     * @param filePath
     * @param response
     * @throws IOException
     */
    @GetMapping("/downloadLocal")
    @ResponseBody
    public void downloadLocal(@RequestParam(value = "filePath") String filePath, HttpServletResponse response) throws IOException {
        DownloadUtils.downloadLocal(filePath, response);
    }

    /**
     * http://127.0.0.1:8080/bigfile/download/downloadFile?filePath=F:/支付宝支付RSA2升级版SDK.rar
     *
     * @param filePath
     * @param response
     * @throws IOException
     */
    @GetMapping("/downloadFile")
    @ResponseBody
    public void downloadFile(@RequestParam(value = "filePath") String filePath, HttpServletResponse response) throws IOException {
        DownloadUtils.downloadFile(response, filePath);
    }

    /**
     * http://127.0.0.1:8080/bigfile/download/zipDownloadRelativePath?filePath=F:/无人机开发文档
     * @param filePath
     * @param response
     * @throws IOException
     */
    @GetMapping("/zipDownloadRelativePath")
    @ResponseBody
    public void zipDownloadRelativePath(@RequestParam(value = "filePath") String filePath, HttpServletResponse response) throws IOException {
        DownloadUtils.zipDownloadRelativePath(response, filePath);
    }

}
