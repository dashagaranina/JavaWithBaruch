package foo.bar.lab02;

import org.springframework.beans.factory.FactoryBean;

public class StringBuilderFactoryBean implements FactoryBean<StringBuilder> {
    private String start;
    private String middle;
    private String finish;


    @Override
    public StringBuilder getObject() throws Exception {
        StringBuilder builder = new StringBuilder(start);
        builder.append(middle).append(finish);
        return builder;
    }

    @Override
    public Class<?> getObjectType() {
        return StringBuilder.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }
}
