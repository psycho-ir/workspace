package com.sarabadani.practice;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.AtLeast;

import java.util.*;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class PersonTest {

    @Mock
    Person person = new Person();

    @InjectMocks
    PersonUser pu = new PersonUser("ss");

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void simpleTest() {
        doThrow(Exception.class).when(person).setName(any(String.class));

        person.setName("sorooosh");
        person.setName("soroosh");
        System.out.println("");
        System.out.println(pu.getPerson());


    }

    @Test
    public void spyTest() {
        List l = new ArrayList<String>();
        List spyList = spy(l);
        spyList.add("hi");

        verify(spyList, new AtLeast(5)).add("hi");
    }

    @Test
    public void filereaderTest() {
//        try (FileReader reader = new FileReader("/home/soroosh/temp/simple.txt");
//             BufferedReader bufferedReader = new BufferedReader(reader);
//        ) {
//
//            String aLine;
//            while ((aLine = bufferedReader.readLine()) != null) {
//                System.out.println(aLine);
//
//            }
//            bufferedReader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    @Test
    public void testHashSet() {
//        Person p = new Person();
//        Set<Person> set = new HashSet<Person>();
//        set.add(p);
//        p.setName("soroosh");
//        CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
//        l.add("soroosh");
//        List ll = l;
//        l.add("soroosh");
//
//        long result = LongStream.rangeClosed(1, 2000).reduce(1, (a, b) -> a + b);
//        System.out.println(result);
//
//        Function<String, Integer> strToInt = Integer::parseInt;
//        System.out.println(strToInt.apply("1000"));


    }

    @Test
    public void t(){
        Date start =  new Date();
        long sum = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        Date end =  new Date();
        //6585
        System.out.println(sum +" "+ (end.getTime()- start.getTime()));
    }
//        System.out.println(Files.read(Paths.get("/home/soroosh/temp/simple.txt")));
}

