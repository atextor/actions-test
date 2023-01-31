package org.example;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
   public static void main( String[] args ) {
      Stream.of( System.getenv( "PATH" ).split( Pattern.quote( File.pathSeparator ) ) )
            .map( Paths::get )
            .forEach( path -> {
               boolean exists = Files.exists( path.resolve( "native-image" ) ) || Files.exists( path.resolve( "native-image.cmd" ) );
               System.out.println("Checking path " + path + " for native-image: " + exists);
            } );
   }
}