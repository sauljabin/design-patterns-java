package pattern.creational.abstractfactory;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class GuiFactorySelectorTest {
    @Test
    public void shouldCreateCorrectFactory() {
        assertThat(GuiFactorySelector.getFactory(OS.LINUX), instanceOf(LinuxFactory.class));
        assertThat(GuiFactorySelector.getFactory(OS.WINDOWS), instanceOf(WindowsFactory.class));
    }

    /**
     * Este es un ejemplo de como se utilizaría el patrón.
     */
    @Ignore
    @Test
    public void exampleAbstractFactory() {
        GuiFactory guiFactory = GuiFactorySelector.getFactory(OS.LINUX);

        Button button = guiFactory.createButton();
        button.paint();

        Panel panel = guiFactory.createPanel();
        panel.paint();
    }
}