package com.example.demo.Services;

import com.example.demo.Dao.ColorDao;
import com.example.demo.Entities.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService {

    @Autowired
    private ColorDao colorDao;

    public List<Color> getAllColors(){
        return colorDao.findAll();
    }

    public List<Color> getColorByName(String name){
        return colorDao.findByColorname(name);
    }

    public Color insertColor(Color color){
        return colorDao.save(color);
    }

}
