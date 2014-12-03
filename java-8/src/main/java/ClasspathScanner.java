import org.atteo.classindex.ClassIndex;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Created by soroosh on 11/24/14.
 */
public class ClasspathScanner {
    public static void main(String... args) {
        System.out.println(ClassIndex.getAnnotatedNames(TestAnnotation.class));
    }
}
