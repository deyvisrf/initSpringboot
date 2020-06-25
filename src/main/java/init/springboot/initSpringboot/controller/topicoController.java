package init.springboot.initSpringboot.controller;

import init.springboot.initSpringboot.controller.dto.TopicoDto;
import init.springboot.initSpringboot.model.Curso;
import init.springboot.initSpringboot.model.Topico;
import init.springboot.initSpringboot.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDto.converter(topicos);
    }
}