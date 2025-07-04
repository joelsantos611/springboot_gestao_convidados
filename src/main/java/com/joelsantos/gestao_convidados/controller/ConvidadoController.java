package com.joelsantos.gestao_convidados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.joelsantos.gestao_convidados.model.Convidado;
import com.joelsantos.gestao_convidados.model.Evento;
import com.joelsantos.gestao_convidados.repository.ConvidadoRepository;
import com.joelsantos.gestao_convidados.repository.EventoRepository;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/convidados")
public class ConvidadoController {  
    @Autowired
    private ConvidadoRepository convidadoRepository;

    private EventoRepository eventoRepository;


    @GetMapping("/")
    public ModelAndView listarConvidados() {
        ModelAndView modelAndView = new ModelAndView("convidados/index");
        modelAndView.addObject("convidados", convidadoRepository.findAll());
        modelAndView.addObject("convidado", new Convidado());
        return modelAndView;
    }
 
    @PostMapping("/salvar")
public String salvarConvidado(Convidado convidado, @RequestParam Long eventoId) {
        // Verifica se o eventoId é válido
        if (eventoId == null || eventoId <= 0) {
            return "redirect:/convidados/novo?error=Evento inválido";
        }
        // Busca o evento pelo ID e associa ao convidado
       Evento evento = eventoRepository.findById(eventoId)
    .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

         convidado.setEvento(evento);
        this.convidadoRepository.save(convidado);
        return "redirect:/convidados/";
    }

    @GetMapping("/novo")
    public ModelAndView novoConvidado() {
        ModelAndView modelAndView = new ModelAndView("convidados/form");
        modelAndView.addObject("convidado",new Convidado());
        return modelAndView;
    }

    @GetMapping("/editar")
    public ModelAndView editarConvidado(@RequestParam Long id) {
            Convidado convidado = convidadoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Convidado não encontrado"));
       
        if (convidado == null) {
            return new ModelAndView("redirect:/convidados/");
        }

        ModelAndView modelAndView = new ModelAndView("convidados/form");
        modelAndView.addObject("convidado", convidado);
        return modelAndView;    
    }

    @GetMapping("/eliminar")
    public String eliminarConvidado(@RequestParam Long id) {
        convidadoRepository.deleteById(id);
        return "redirect:/convidados/";
    }

}
