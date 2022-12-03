package com.example.demo.Controllers;

import com.example.demo.Entities.Color;
import com.example.demo.Services.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ColorController {

    @Autowired
    private ColorService colorService;

    @GetMapping("/colors")
    public List<Color> getAllColors(){
        return colorService.getAllColors();
    }

    @GetMapping("/colors/{name}")
    public List<Color> getByColorname(@PathVariable(name = "name") String name){
        return colorService.getColorByName(name);
    }

    @PostMapping("/color")
    public Color insertColor(@RequestBody Color color){
        return colorService.insertColor(color);
    }

}
