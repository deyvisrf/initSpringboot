package init.springboot.initSpringboot.controller;

import init.springboot.initSpringboot.controller.dto.TopicoDto;
import init.springboot.initSpringboot.model.Curso;
import init.springboot.initSpringboot.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicoController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {

        Topico topico = new Topico("muda tudo", "agora vai", new Curso("spring", "programmer"));

        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}