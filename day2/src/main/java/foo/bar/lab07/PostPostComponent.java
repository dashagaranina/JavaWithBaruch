package foo.bar.lab07;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostPostComponent {

    @PostConstruct
    public void postComponent(){
        System.out.println("p construct");
    }

    @PostInitialized
    public void postInitialized (){
        System.out.println("initialized");
    }
}
