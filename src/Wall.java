import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;
    private CompositeBlock compositeBlock;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return compositeBlock.getBlocks().stream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> result = new ArrayList<>();
        for (Block block : compositeBlock.getBlocks()) {
            if (block.getMaterial().equals(material)) {
                result.add(block);
            }
        }
        return result;
    }

    @Override
    public int count() {
        return compositeBlock.getBlocks().size();
    }
}