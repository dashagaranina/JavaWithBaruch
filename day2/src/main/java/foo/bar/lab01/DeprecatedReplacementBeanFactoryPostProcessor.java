package foo.bar.lab01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DeprecatedReplacementBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String name: beanDefinitionNames){
            try {
                BeanDefinition beanDefinition =  beanFactory.getBeanDefinition(name);

                DeprecatedSteroids deprecatedOnSteroids =
                        (Class.forName(beanDefinition.getBeanClassName())).getAnnotation(DeprecatedSteroids.class);
                if (deprecatedOnSteroids!=null){
                    beanDefinition.setBeanClassName(deprecatedOnSteroids.replacedWith().getName());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

    }
}
