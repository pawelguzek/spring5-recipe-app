package guzek.springframework.controllers;

import guzek.springframework.domain.Category;
import guzek.springframework.domain.UnitOfMeasure;
import guzek.springframework.repositories.CategoryRepository;
import guzek.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController() {

    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {


        return "index";
    }
}
