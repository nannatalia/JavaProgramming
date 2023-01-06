package day45_Abstraction.Practice.BrowserTask;

public interface SearchContext {
    abstract void findElement(String locator);
    abstract void findElements(String locator);
}
