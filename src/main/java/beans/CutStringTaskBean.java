package beans;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import service.CutStringService;

@ManagedBean(name = "task")
@SessionScoped
@Stateless
public class CutStringTaskBean {
    @EJB
    CutStringService cutStringService;
    private Integer cutLength;
    private String inputString;
    private String outputString;

    public CutStringTaskBean() {
        inputString = "";
    }

    public CutStringTaskBean(Integer cutLength, String inputString) {
        this.cutLength = cutLength;
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public Integer getCutLength() {
        return cutLength;
    }

    public void setCutLength(Integer cutLength) {
        this.cutLength = cutLength;
    }

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    public String cutString() {
        if (outputString == null) {
            outputString = cutStringService.performCutString(inputString, cutLength);
        }
        return "result.xhtml?faces-redirect=true";
    }

    public String returnToIndexPage() {
        inputString = null;
        cutLength = null;
        return "index.xhtml?faces-redirect=true";
    }

    @Override
    public String toString() {
        return cutLength + " " + inputString + " " + outputString;
    }
}
