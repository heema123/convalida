package convalida.validators

import android.widget.EditText
import java.util.regex.Pattern

/**
 * @author Wellington Costa on 21/06/2017.
 */
class PatternValidator(editText: EditText, errorMessage: String, private val pattern: String, autoDismiss: Boolean) : AbstractValidator(editText, errorMessage, autoDismiss) {

    override fun isNotValid(value: String): Boolean {
        return !Pattern.matches(pattern, value)
    }

}
