package com.danieladams.android.aca.finale;



import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

//A compound view for each hero ability
public class Ability extends TableLayout {
    public Ability(Context context, String name, String key, String description) {
        super(context);
        initializeViews(context);
        this.setName(name);
        this.setKey(key);
        this.setDescription(description);
    }
    public Ability(Context context) {
        super(context);
        initializeViews(context);
    }
    public Ability(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeViews(context);
    }

    private void initializeViews(Context context){
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.ability, this);
    }

    //set name of the ability
    public void setName(String name){
        TextView abilityName = (TextView)this.findViewById(R.id.ability_name);
        abilityName.setText(name);
    }

    //set the default key of the ability (1, 2, LMB, RMB, Shift, E, Q)
    public void setKey(String key){
        TextView abilityKey = (TextView)this.findViewById(R.id.ability_key);
        if(!key.equals("")) abilityKey.setText(key);
        else abilityKey.setText("Passive");
    }

    //set description of the ability
    public void setDescription(String description){
        TextView abilityDescription = (TextView)this.findViewById(R.id.ability_description);
        abilityDescription.setText(description);
    }


    //add a set of stats
    public void addStat(AbilityStat stat){
        TableRow abilityStatRow=(TableRow)this.findViewById(R.id.row_ability_stats);
        abilityStatRow.addView(stat);
        TableLayout abilityStatSection = (TableLayout)this.findViewById(R.id.tbl_ability_stats);
        abilityStatSection.setStretchAllColumns(true);
    }
}
