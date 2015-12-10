#include <mbgl/style/style_layer.hpp>

namespace mbgl {

const std::string& StyleLayer::bucketName() const {
    return ref.empty() ? id : ref;
}

bool StyleLayer::hasRenderPass(RenderPass pass) const {
    return bool(passes & pass);
}

} // namespace mbgl
