package tiny.controllers;

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
public class TinyUrlController {

    @Autowired
    private TinyUrlService tinyUrlService;

    @PostMapping
    public ResponseEntity<?> generateUrl(@RequestBody String url) {
        String generatedId = tinyUrlService.createUrl(url);

        if (!generatedId.isEmpty()) {

            return ResponseEntity.status(HttpStatus.CREATED).body(generatedId);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong");
    }

}
