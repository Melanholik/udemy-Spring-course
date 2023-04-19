package springCourse;


import org.springframework.stereotype.Component;

@Component
public class PopMusic extends AbstractMusic {

    public PopMusic() {
        songsList.add("Тату - «Нас не догонят»");
        songsList.add("Григорий Лепс - «Рюмка водки на столе»");
        songsList.add("Людмила Зыкина - «Течет река Волга»");
    }
}
