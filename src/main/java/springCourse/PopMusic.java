package springCourse;


import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Тату - Нас не догонят";
    }
}
