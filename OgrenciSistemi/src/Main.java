import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Ogrenci> ogrenciler = Arrays.asList(
                new Ogrenci("Mert", 75, "A"),
                new Ogrenci("Ayberk", 60, "B"),
                new Ogrenci("Tuğrul", 30, "C"),
                new Ogrenci("Batu", 80, "D"),
                new Ogrenci("Can", 20, "D"),
                new Ogrenci("Anıl", 100, "E"),
                new Ogrenci("Özcan", 50, "A"),
                new Ogrenci("Onur", 15, "B")
        );


        Map<String,List<Ogrenci>> classGroup = ogrenciler.stream()
                .collect(Collectors.groupingBy(Ogrenci::getClassName));
        System.out.println("Sınıflar:" + classGroup);


        Map<String,Optional<Ogrenci>> EnYuksekNotluSinif = ogrenciler.stream()
                .collect(Collectors.groupingBy(Ogrenci::getClassName,
                        Collectors.maxBy(Comparator.comparingInt(Ogrenci::getGrade))));
        System.out.println("Sınıfın En Yüksek Not Alan Öğrencileri:" + EnYuksekNotluSinif);


        Optional<Ogrenci> enYuksekNotluOgrenci = ogrenciler.stream()
                .max(Comparator.comparingInt(Ogrenci::getGrade));
        System.out.println("En Yüksek Not Alan Öğrenci:" + enYuksekNotluOgrenci);


        List<Ogrenci> notu70UstuOlanOgrenciler = ogrenciler.stream()
                .filter(ogrenci -> ogrenci.getGrade() > 70)
                .collect(Collectors.toList());
        System.out.println("Notu 70 Üstü Olan Öğrenciler:" + notu70UstuOlanOgrenciler);


       List<Ogrenci> ogrenciSiralama = ogrenciler.stream()
               .sorted(Comparator.comparingInt(Ogrenci::getGrade))
               .collect(Collectors.toList());
        System.out.println("Öğrencileri Notlarına Göre Sıralama: " + ogrenciSiralama);


        }
    }
