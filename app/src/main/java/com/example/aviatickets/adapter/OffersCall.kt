import androidx.recyclerview.widget.DiffUtil
import com.example.aviatickets.model.entity.Offer

class OffersCall(
    private val oldList: List<Offer>,
    private val newList: List<Offer>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldOffer = oldList[oldItemPosition]
        val newOffer = newList[newItemPosition]
        return oldOffer.id == newOffer.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldOffer = oldList[oldItemPosition]
        val newOffer = newList[newItemPosition]
        return oldOffer == newOffer
    }
}
