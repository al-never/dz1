package ru.alnever.dz1.usb;

public class AdapterMemoryCardToComputer extends Computer implements USB {
    private MemoryCard card;
    public AdapterMemoryCardToComputer(MemoryCard card) {
        this.card = card;
    }
    @Override
    public String readData() {
        return card.getData();
    }
}
