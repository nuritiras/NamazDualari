package tr.com.nuritiras.namazdualari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tr.com.nuritiras.namazdualari.databinding.FragmentDuaBinding
import tr.com.nuritiras.namazdualari.databinding.FragmentListeBinding

class DuaFragment : Fragment() {

    private var _binding: FragmentDuaBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDuaBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageViewDua.setOnClickListener{

        }

        binding.buttonSil.setOnClickListener {

        }

        binding.buttonKaydet.setOnClickListener {

        }

        arguments?.let {
            val bilgi = DuaFragmentArgs.fromBundle(it).bilgi
            if (bilgi=="yeni")
            {
                binding.buttonSil.isEnabled=false
                binding.buttonKaydet.isEnabled=true
            }
            else
            {
                binding.buttonSil.isEnabled=true
                binding.buttonKaydet.isEnabled=false
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}