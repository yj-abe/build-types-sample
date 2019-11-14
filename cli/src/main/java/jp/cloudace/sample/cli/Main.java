package jp.cloudace.sample.cli;

public class Main {

    public static void main(String[] args) {

        if (BuildConfig.DEBUG) {
            System.out.println("Debug mode");
        }

        System.out.println("Build type is " + BuildConfig.BUILD_TYPE);
        System.out.println("API key is " + BuildConfig.API_KEY);

    }

}
