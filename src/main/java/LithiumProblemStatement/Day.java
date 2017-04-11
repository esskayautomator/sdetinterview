package LithiumProblemStatement;
import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("org.jsonschema2pojo")
public class Day {

    private Integer day;
    private Double high;
    private Double ave;
    private Double low;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The day
     */
    public Integer getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * 
     * @return
     *     The high
     */
    public Double getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    public void setHigh(Double high) {
        this.high = high;
    }

    /**
     * 
     * @return
     *     The ave
     */
    public Double getAve() {
        return ave;
    }

    /**
     * 
     * @param ave
     *     The ave
     */
    public void setAve(Double ave) {
        this.ave = ave;
    }

    /**
     * 
     * @return
     *     The low
     */
    public Double getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    public void setLow(Double low) {
        this.low = low;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
