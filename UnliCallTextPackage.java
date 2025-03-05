public class UnliCallTextPackage implements UnliCallTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliCallText ? "Unlimited calls and texts available." : "No unlimited calls and texts available.";
    }
}
