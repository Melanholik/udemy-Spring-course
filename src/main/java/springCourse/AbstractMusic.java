package springCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class AbstractMusic implements Music, InitAndDestroy {
    List<String> songsList = new ArrayList<>();

    @Override
    public String getSong(){
        Random random = new Random();
        int index = random.nextInt(songsList.size());
        return songsList.get(index);
    }

    public void init() {
        System.out.println("Init " + this.getClass().getName());
    }

    public void destroy() {
        System.out.println("Destroy " + this.getClass().getName());
    }

}
