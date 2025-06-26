///usr/bin/env jbang "$0" "$@" ; exit $?


import static java.lang.System.*;

public class caniaccessprivategithubrepos {

    public static void main(String... args) {

        out.println("Checking access to private GitHub repos");

        final String githubAccessToken = getenv( "GITHUB_ACCESS_TOKEN" );

        if ( githubAccessToken == null || githubAccessToken.isEmpty() ) {
            out.println( "GITHUB_ACCESS_TOKEN environment variable is not set." );
            exit( 1 );
        } else {
            out.println( "GITHUB_ACCESS_TOKEN is set." );
            out.println( "You can access private GitHub repos." );
            exit( 0 );
        }

    }

}
