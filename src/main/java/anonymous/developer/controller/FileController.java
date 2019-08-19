package anonymous.developer.controller;

import anonymous.developer.common.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class FileController {
    private final String basePath = "/upload/";
    private final String picturePath = basePath+"image/";
    private final String filePath = basePath+"file/";

    /**
     * 上传图片
     * @param picture
     * @return
     * @throws IOException
     */
    @PostMapping("uploadPicture")
    public CommonResult uploadPicture(MultipartFile picture) throws IOException {
        if(picture.isEmpty()){
            return CommonResult.createCommonResult("文件为空");
        }
        String pictureSuffix = picture.getName().substring(picture.getName().lastIndexOf("."));

        File path = new File(picturePath);
        if(!path.exists()){
            path.mkdirs();
        }

        String outputPath = picturePath+ UUID.randomUUID().toString()+pictureSuffix;
        File file = new File(outputPath);
        picture.transferTo(file);
        return CommonResult.createCommonResult(outputPath);
    }

    @PostMapping("/uploadFile")
    public CommonResult uploadFile(MultipartFile File) throws IOException {
        if(File.isEmpty()){
            return CommonResult.createCommonResult("文件为空");
        }
        String filesuffix = File.getName().substring(File.getName().lastIndexOf("."));

        File path = new File(filePath);
        if(!path.exists()){
            path.mkdirs();
        }

        String outputPath = filePath+ UUID.randomUUID().toString()+filesuffix;
        File file = new File(outputPath);
        File.transferTo(file);
        return CommonResult.createCommonResult(outputPath);
    }
}