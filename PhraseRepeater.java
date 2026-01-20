/*
 * Accessing Fields in Methods (PhraseRepeater)
 * This class stores a phrase and a repeat count as fields, then can return
 * the phrase repeated that many times. You will add a boolean field that
 * controls whether the output is capitalized (SHOUT MODE).
 */
public class PhraseRepeater
{
    String phrase;
    int repeats;
    boolean capitalize; // TODO: Use this to control uppercase output

    public void setValues(String p, int r, boolean b)
    {
        phrase = p;
        repeats = r;
        capitalize = b;
    }

    public String getRepeatedPhrase()
    {
        String result = "";
        
        if (capitalize) {
            phrase = phrase.toUpperCase();
        }
        
        
        for (int i = 0; i < repeats; i++)
        {
            result += phrase;
        }
        
        return result;
    }
}
