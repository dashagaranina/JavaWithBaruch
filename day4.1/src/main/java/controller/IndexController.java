package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String pathVar(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> map = new HashMap<>();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            map.put(key, request.getHeader(key));
        }
        modelMap.put("headers", map);
        return "index";
    }


    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
    public String pathVar(@PathVariable String id, @RequestHeader Map<String, String> headers, ModelMap modelMap) {
        modelMap.put("var", id);
        modelMap.addAttribute(headers);
        return "index";
    }

    @RequestMapping(value = "/string", method = RequestMethod.GET, headers = {}, produces = "text/plain;charset=UTF-8")
    public String string(@RequestBody String body) {
        return body;
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET, headers = {"content-type=application/json"}, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String json(@RequestBody String body) {
        try {
            return new ObjectMapper().readValue(body, String.class);
        } catch (IOException e) {
            e.printStackTrace();
            return "null value";
        }
    }

    //doesn't work
/*    @RequestMapping(value = "/location/guest", method = RequestMethod.POST)
    public ResponseEntity<String> createGuest(RequestEntity<Guest> guestRequestEntity) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(URI.create("/guest"));
        responseHeaders.set("MyResponseHeader", "MyValue");
        return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.SC_CREATED);
    }*/
}
