package com.codeclan.example.leaderboard_app.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class TeamNameGenerator {

    private ArrayList<String> adjectives;
    private ArrayList<String> animals;

    public TeamNameGenerator() {
        this.adjectives = new ArrayList<>(Arrays.asList("adorable" ,
                "fearful" ,
                "cagey" ,
                "bouncy" ,
                "parsimonious" ,
                "common" ,
                "exotic" ,
                "charming" ,
                "roomy" ,
                "guiltless" ,
                "dazzling" ,
                "illegal" ,
                "marvelous" ,
                "spotted" ,
                "unkempt" ,
                "spiritual" ,
                "elegant" ,
                "tacit" ,
                "black" ,
                "lazy" ,
                "ready" ,
                "curvy" ,
                "icky" ,
                "superb" ,
                "tricky" ,
                "tall" ,
                "coordinated" ,
                "changeable" ,
                "axiomatic" ,
                "gentle" ,
                "volatile" ,
                "old" ,
                "good" ,
                "better" ,
                "pumped" ,
                "equable" ,
                "super" ,
                "parched" ,
                "fluffy" ,
                "low" ,
                "hurried" ,
                "squeamish" ,
                "greasy" ,
                "stingy" ,
                "lively" ,
                "sick" ,
                "colorful" ,
                "selective" ,
                "nutty" ,
                "shallow" ,
                "alleged" ,
                "used" ,
                "steadfast" ,
                "difficult" ,
                "oval" ,
                "burly" ,
                "mountainous" ,
                "absent" ,
                "grieving" ,
                "spotless" ,
                "tiny" ,
                "sad" ,
                "sparkling" ,
                "languid" ,
                "distinct" ,
                "lethal" ,
                "half" ,
                "terrible" ,
                "free" ,
                "selfish" ,
                "trashy" ,
                "open" ,
                "gullible" ,
                "natural" ,
                "fixed" ,
                "petite" ,
                "famous" ,
                "soft" ,
                "cheap" ,
                "fascinated" ,
                "juicy" ,
                "shaggy" ,
                "callous" ,
                "heavenly" ,
                "immense" ,
                "hushed" ,
                "healthy" ,
                "periodic" ,
                "grubby" ,
                "full" ,
                "quickest" ,
                "incandescent" ,
                "forgetful" ,
                "optimal" ,
                "muddled" ,
                "shy" ,
                "nervous" ,
                "unnatural" ,
                "unequaled" ,
                "far-flung"));
        this.animals = new ArrayList<>(Arrays.asList("civets" ,
                "minks" ,
                "orcs" ,
                "mongooses" ,
                "fawns" ,
                "mice" ,
                "kangaroos" ,
                "crocodiles" ,
                "foxes" ,
                "wolfs" ,
                "meerkats" ,
                "koalas" ,
                "guanacos" ,
                "lizards" ,
                "mountain goats" ,
                "gophers" ,
                "bumble bees" ,
                "gnus" ,
                "kittens" ,
                "lovebirds" ,
                "dugongs" ,
                "elks" ,
                "octopussies" ,
                "cows" ,
                "hippopotamusses" ,
                "frogs" ,
                "roosters" ,
                "rats" ,
                "jackals" ,
                "hedgehogs" ,
                "hyenas" ,
                "tapirs" ,
                "ferrets" ,
                "crows" ,
                "bighorns" ,
                "alpacas" ,
                "polar bears" ,
                "chamoises" ,
                "apes" ,
                "llamas" ,
                "snakes" ,
                "grizzly bears" ,
                "skunks" ,
                "mynah birds" ,
                "starfish" ,
                "waterbucks" ,
                "gorillas" ,
                "colts" ,
                "cougars" ,
                "mustangs" ,
                "zebras" ,
                "wildcats" ,
                "rabbits" ,
                "blue crabs" ,
                "dung beetles" ,
                "mares" ,
                "basilisks" ,
                "otters" ,
                "okapis" ,
                "bison" ,
                "sheep" ,
                "buffaloes" ,
                "stallions" ,
                "salamanders" ,
                "musk deer" ,
                "muskrats" ,
                "pigs" ,
                "alligators" ,
                "silver foxes" ,
                "impalas" ,
                "woodchucks" ,
                "opossums" ,
                "warthogs" ,
                "oxs" ,
                "parrots" ,
                "budgerigars" ,
                "elands" ,
                "snowy owls" ,
                "sloths" ,
                "wolverines" ,
                "elephants" ,
                "highland cows" ,
                "seals" ,
                "chinchillas" ,
                "boars" ,
                "whales" ,
                "hares" ,
                "bald eagles" ,
                "lions" ,
                "panthers" ,
                "ponies" ,
                "prairie dogs" ,
                "dromedaries" ,
                "guinea pigs" ,
                "steers" ,
                "mandrills" ,
                "quaggas" ,
                "bears" ,
                "zebus" ,
                "cheetah"));
    }

    public ArrayList<String> getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(ArrayList<String> adjectives) {
        this.adjectives = adjectives;
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<String> animals) {
        this.animals = animals;
    }

    public String generateName(){
        String adjective = this.adjectives.get(ThreadLocalRandom.current().nextInt(0, this.adjectives.size()));
        String animal = this.animals.get(ThreadLocalRandom.current().nextInt(0, this.animals.size()));
        String capitalAdjective = adjective.substring(0,1).toUpperCase() + adjective.substring(1);
        String capitalAnimal = animal.substring(0,1).toUpperCase() + animal.substring(1);
        return capitalAdjective + " " + capitalAnimal;
    }
}
