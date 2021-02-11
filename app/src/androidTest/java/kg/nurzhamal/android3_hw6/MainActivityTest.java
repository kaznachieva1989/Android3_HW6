package kg.nurzhamal.android3_hw6;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void addTest() {
        onView(withId(R.id.et_oper1)).perform(typeText("2"));
        onView(withId(R.id.et_oper2)).perform(typeText("4"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("6")));
    }

    @Test
    public void minusTest() {
        onView(withId(R.id.et_oper1)).perform(typeText("4"));
        onView(withId(R.id.et_oper2)).perform(typeText("2"));
        onView(withId(R.id.btn_minus)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("2")));
    }

    @Test
    public void mulitplyTest() {
        onView(withId(R.id.et_oper1)).perform(typeText("4"));
        onView(withId(R.id.et_oper2)).perform(typeText("2"));
        onView(withId(R.id.btn_multiply)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("8")));
    }

    @Test
    public void divisionTest() {
        onView(withId(R.id.et_oper1)).perform(typeText("4"));
        onView(withId(R.id.et_oper2)).perform(typeText("2"));
        onView(withId(R.id.btn_division)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("2")));
    }
}
