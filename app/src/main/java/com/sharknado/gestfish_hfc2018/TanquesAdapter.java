package com.sharknado.gestfish_hfc2018;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sharknado.gestfish_hfc2018.models.TanqueModel;

import java.util.ArrayList;

public class TanquesAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<TanqueModel> lista;

    public TanquesAdapter(Context context, ArrayList<TanqueModel> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public TanqueModel getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TanqueModel tanque = lista.get(position);
        View layout;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = inflater.inflate(R.layout.celula_tanque, null);
        } else {
            layout = convertView;
        }

        TextView viewTipo = layout.findViewById(R.id.viewTipo);
        viewTipo.setText(tanque.getTipo());

        TextView viewTipoProducao = layout.findViewById(R.id.viewTipoProducao);
        viewTipoProducao.setText(tanque.getTipoProducao());

        TextView viewEspecie = layout.findViewById(R.id.viewEspecie);
        viewEspecie.setText(tanque.getEspecie());

        TextView viewTamanho = layout.findViewById(R.id.viewTamanho);
        viewTamanho.setText(String.valueOf(tanque.getTamanho())+" m³");
        TextView viewQtdPeixes = layout.findViewById(R.id.viewQtdPeixes);
        viewQtdPeixes.setText(String.valueOf(tanque.getQtdPeixes()));

        return layout;
    }
}
