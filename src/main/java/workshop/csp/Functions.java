package workshop.csp;

import com.google.common.base.Function;

public class Functions {
    public static Function<Integer, Integer> inc = new Function<Integer, Integer>() {

        @Override
        public Integer apply(Integer integer) {
            return integer + 1;
        }
    };

}
