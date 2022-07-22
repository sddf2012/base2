package webservice;

import webservice.animal.Cat;
import webservice.animal.impl.AnimalService;
import webservice.animal.impl.AnimalServiceImpl;

/**
 * @author liu peng bo
 * @date 2022-7-22 10:08
 */
public class AnimalClient {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalServiceImpl().getAnimalPort();
        Cat cat = animalService.getCat("tom1");
        System.out.println(cat);
    }
}
