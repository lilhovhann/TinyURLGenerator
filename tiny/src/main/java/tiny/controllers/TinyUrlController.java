package tiny.controllers;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tiny.services.TinyUrlService;

/**
 *
 * @author lilith
 */
@RestController
@RequestMapping(value = "/api/rest/url")
@Slf4j
public class TinyUrlController {

    @Autowired
    private TinyUrlService tinyUrlService;

    @PostMapping(path = "/post")
    public ResponseEntity<?> generateUrl(@RequestBody String url) {

        UrlValidator urlValidator = new UrlValidator();
        if (urlValidator.isValid(url)) {
            String generatedId = tinyUrlService.createUrl(url);

            if (!generatedId.isEmpty()) {

                return ResponseEntity.status(HttpStatus.CREATED).body(generatedId);
            }
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Something went wrong");
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("URL is not Valid");

    }

//    @GetMapping(path = "/get")
//    public RedirectView redirect(@RequestParam String id) {
//
//        String foundUrl = tinyUrlService.findUrl(id);
//
//        if (foundUrl != null) {
//            log.info("Redirecting url " + foundUrl);
//            return new RedirectView(foundUrl);
//        }
//        log.info("URL Not found");
//        return new RedirectView("google.com");
//
//    }

}
