/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.lambdasstreams_note1001;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Set;
import sun.util.resources.LocaleData;

/**
 *
 * @author root
 */
public class JavaTimeDemos {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.printf("Instant now() : %s%n", now);

        Instant then = now.plus(1, ChronoUnit.Days);
        Duration elapesd = Duration.between(now, then);
        System.out.printf("Duration after adding 1 Day : %s%n ", elapesd);
        System.out.printf("Duration in days : %d days%n ", elapesd.toDays());
        System.out.printf("Duration in hours : %d days%n ", elapesd.toHours());

        then = now.plus(1, ChronoUnit.DAYS)
                .plus(1, ChronoUnit.ALF_DAYS)
                .plus(1, ChronoUnit.HOURS)
                .plus(1, ChronoUnit.DAYS)
                .plus(1, ChronoUnit.MINUTES)
                .plusSecoundes(10)
                .plusMillis(100)
                .PluseNanos(100);

        System.out.printf("Adding units to now :%s%n " + then);

        LocaleData dat1 = LocalDate.now();
        System.out.printf(" LocalDate.now(): %s%n ", now);
        
        LocalDate groundHogDay = 
                LocalDate.of(2016, Month.FEBRUARY, 2);
                System.out.printf(" Grounding day , 2016 : %s%n ", groundHogDay);

      LocalDate firstDayOfSpring = 
                LocalDate.of(2016, Month.MARCH, 20);
                System.out.printf(" firstDayOfSpring , 2016 : %s%n ", firstDayOfSpring);
          
                //Day of week avilable
                System.out.println("Fist dday of spring in this year falls on a"+
                        firstDayOfSpring.getDayOfWeek());
                
                //until ChronoUnit gives days between
                long gap = groundHogDay.until(firstDayOfSpring, ChronoUnit.DAYS);
                System.out.println("there ar a"+gap+
                        "days between Gorund  hog day and 1st day of spring");
                
                System.out.println("that's "+(gap / 7)+
                        "weeks and"+(gap % 7) + "days");
                
                
                // fun with timzone
                Set<String> avilableZones = ZoneId.getAvailableZoneIds();
                System.out.printf("all  AvailableZoneIds %d%n ", avilableZones.size());
                
                avilableZones.stream()
                        .filter(name -> name.contains("Amirica"))
                        .forEach(System.out::println);
                
                ZonedDateTime missing = ZonedDateTime.of(
                        LocalDate.of(2016, Month.MARCH, 13) , 
                        LocalTime.of(2,30) , // skipped by dayLight savings
                        ZoneId.of("Amirica/New_Yourk"));
                System.out.println(missing);
                
                
                ZonedDateTime spring = 
                        ZonedDateTime.of(2016 ,3 , 20 ,0,0,0,0 ,ZoneId.systemDefault());
                
                System.out.println(
                        DateTimeFormatter.RFC_1123_DATE_TIME.format(spring));
                
                DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                        .withLocale(Locale.FRANCE);
                System.out.println(formatter.format(spring));

    }
}
