package zc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@Slf4j
@RestController
@RequestMapping("/cmd")
public class CmdController {

    @GetMapping("/start")
    public String start() {
        String rs;
        String message = MessageFormat.format("平安到家，{0}，你好,{1}，我爱你..........", "wanzhs", "nanyan");
        log.info(message);
        rs="成功";
        return rs;
    }
}
