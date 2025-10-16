package x.bv.demos.skeleton.test.slice.jimmer;

import org.springframework.boot.test.autoconfigure.filter.AnnotationCustomizableTypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.util.Objects;
import java.util.Set;

public class JimmerTypeExcludeFilter extends AnnotationCustomizableTypeExcludeFilter {

    private final JimmerTest annotation;

    JimmerTypeExcludeFilter(Class<?> testClass) {

        this.annotation = AnnotatedElementUtils.getMergedAnnotation(testClass, JimmerTest.class);
    }

    @Override
    protected boolean hasAnnotation() {

        return Objects.nonNull(annotation);
    }

    @Override
    protected ComponentScan.Filter[] getFilters(FilterType type) {
        switch (type) {
            case INCLUDE:
                return this.annotation.includeFilters();
            case EXCLUDE:
                return this.annotation.excludeFilters();
            default:
                throw new IllegalStateException("Unsupported type " + type);
        }
    }

    @Override
    protected boolean isUseDefaultFilters() {

        return this.annotation.useDefaultFilters();
    }

    @Override
    protected Set<Class<?>> getDefaultIncludes() {

        return Set.of();
    }

    @Override
    protected Set<Class<?>> getComponentIncludes() {

        return Set.of();
    }
}
