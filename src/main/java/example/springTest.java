package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        testBean tb = context.getBean("testBean", testBean.class);

//        System.out.println(tb.getName());
//
//        testBean testBean = new testBean("Abdulloh");
//
//        testBean.setName("Sarvar");
//        testBean.getName();
//        context.close();

        Movie movie = context.getBean("actMovie", ActionMovie.class);

        PlayMovie playMovie = new PlayMovie(movie);

        playMovie.Player();
    }
}
