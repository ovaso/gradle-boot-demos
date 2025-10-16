package x.bv.demos.skeleton.test.slice.jimmer;

import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.test.context.TestContextAnnotationUtils;

public class JimmerTestContextBootstrapper extends SpringBootTestContextBootstrapper {
    @Override
    protected String[] getProperties(Class<?> testClass) {
        JimmerTest ORMTest = TestContextAnnotationUtils.findMergedAnnotation(testClass, JimmerTest.class);
        return (ORMTest != null) ? ORMTest.properties() : null;
    }

}
