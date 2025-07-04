package com.joelsantos.gestao_convidados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.joelsantos.gestao_convidados.model.Evento;
import com.joelsantos.gestao_convidados.repository.EventoRepository;

@Controller
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
   private EventoRepository eventoRepository;

   

    @GetMapping("/")
    public ModelAndView listarEvento() {
        ModelAndView modelAndView = new ModelAndView("eventos/index");
        modelAndView.addObject("eventos", eventoRepository.findAll());
        modelAndView.addObject("evento", new Evento());
        return modelAndView;
    }
 
    @PostMapping("/salvar")
public String salvarConvidado(Evento convidado) {
        this.eventoRepository.save(convidado);
        return "redirect:/eventos/";
    }

    @GetMapping("/novo")
    public ModelAndView novoConvidado() {
        ModelAndView modelAndView = new ModelAndView("eventos/form");
        modelAndView.addObject("evento",new Evento());
        return modelAndView;
    }

    @GetMapping("/editar")
    public ModelAndView editarConvidado(@RequestParam Long id) {
            Evento evento = eventoRepository.findById(id).orElse(null);
       
        if (evento == null) {
            return new ModelAndView("redirect:/eventos/");
        }

        ModelAndView modelAndView = new ModelAndView("eventos/form");
        modelAndView.addObject("evento", evento);
        return modelAndView;    
    }

    @GetMapping("/eliminar")
    public String eliminarConvidado(@RequestParam Long id) {
        eventoRepository.deleteById(id);
        return "redirect:/eventos/";
    }

}
