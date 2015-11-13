package data.bug129402;



//import javax.annotation.NonNull;

import data.EntityUnusedInspection;

/**
 * View model for application permission category detail page.
 */
public class Bug129402 extends EntityUnusedInspection {

    @NonNull
    private EntityUnusedInspection category;

    public Bug129402(@NonNull EntityUnusedInspection category) {
        this.category = category;
    }

    @NonNull
    public EntityUnusedInspection getCategory() {
        return category;
    }

    /*@NonNull String getString(String maybeString) {
        if (maybeString != null)
            return maybeString;                         // the above null check is required
        else
            return "<n/a>";
    }
    void caller(String s) {
        System.out.println(getString(s).toUpperCase()); // no null check required
    }*/


}
