package com.group.projetoSpringBoot.controller;




import com.group.projetoSpringBoot.model.Jedi;
import com.group.projetoSpringBoot.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class JediController {

    @Autowired
    private JediRepository repository;

    @GetMapping("/jedi")
    public ModelAndView jedi(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");

        modelAndView.addObject("allJedi", repository.getAllJedi());

        return modelAndView;
    }


    @GetMapping("/new-jedi")
    public ModelAndView newJedi(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-jedi");

        modelAndView.addObject("jedi", new Jedi());

        return modelAndView;
    }


    @PostMapping("/jedi")
    public String createJedi(@ModelAttribute Jedi jedi, BindingResult result, RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
            return "new-jedi";
        }

        repository.add(jedi);

        redirectAttributes.addFlashAttribute("message", "Jedi cadastrado com sucesso");
        return "redirect:jedi";
    }

}
