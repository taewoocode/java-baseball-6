package baseball;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    public static ControllerTest newInstance() {
        
        android.os.Bundle args = new Bundle();
        
        ControllerTest fragment = new ControllerTest();
        fragment.setArguments(args);
        return fragment;
    }
}