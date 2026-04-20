//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
//countries on console whenever the countries are selected on the list.


package p5c;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryCapitalJList extends JFrame {

    private JList<String> countryList;
    private Map<String, String> countryCapitalMap;

    public CountryCapitalJList() {

        // Create map of countries and capitals
        countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "Addis Ababa");
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Create list model
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String country : countryCapitalMap.keySet()) {
            model.addElement(country);
        }

        // Create JList
        countryList = new JList<>(model);

        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    if (selectedCountry != null) {
                        String capital = countryCapitalMap.get(selectedCountry);
                        System.out.println("Capital of " + selectedCountry + " is: " + capital);
                    }
                }
            }
        });

        // Add to frame
        add(new JScrollPane(countryList));

        // Frame settings
        setTitle("Country Capital List");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalJList();
    }
}
