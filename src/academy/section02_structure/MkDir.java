package academy.devonline.java.basic.section02_structure;

import java.io.File;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class MkDir {
    public static void main(String[] args) {
        new File(args[0]).mkdir();
    }
}