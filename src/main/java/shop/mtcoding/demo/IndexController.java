package shop.mtcoding.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        String myName = "choi";
        log.debug("{}님의 디버그", myName);
        log.info("{}님의 인포", myName);
        log.warn("{}님의 워닝", myName);
        log.error("{}님의 에러", myName);
        return "index ok";
    }

}
